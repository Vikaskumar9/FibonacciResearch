import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ScheduleDeparture {


        public static WaitTime scheduleStudents(List<Integer> arrival,int N,int M,int C){

            WaitTime[][] dp = new WaitTime[N+1][M+1];
            // initialize worst case timings - i.e MAX int value
            for (int j = 0; j <= M; ++j) dp[N][j] = new WaitTime(0, 0);
            for (int i = 0; i < N ; ++i) dp[i][M] = new WaitTime(Integer.MAX_VALUE, Integer.MAX_VALUE);

            for (int i = N - 1; i >= 0 ; --i) {
                for (int j = M - 1; j >= 0; --j) {
                    int minWaitTime = Integer.MAX_VALUE, minTotalWaitTime = Integer.MAX_VALUE;
                    // gradually increase capacity and fill in the car
                    // the bottleneck is the capacity of the car -> optimize of having max capacity
                    for (int k = 1; k <= C; ++k) {
                        if (i + k > N) break;
                        WaitTime time = dp[i + k][j + 1];
                        if (time.minWaitTIme != Integer.MAX_VALUE) {
                            int currWait = k == 1 ? 0 : arrival.get(i+k-1) - arrival.get(i);
                            minWaitTime = Math.min(minWaitTime, Math.max(time.minWaitTIme, currWait));
                            minTotalWaitTime = Math.min(minTotalWaitTime, time.minTotalWaitTime + currWait);
                        }
                    }
                    dp[i][j] = new WaitTime(minWaitTime, minTotalWaitTime);
                }
            }
            return dp[0][0];

        }
        public static void main(String args[]){

            List<Integer> schedule1 = Arrays.asList(1,1,2,2,5);
            List<Integer> schedule2 = Arrays.asList(1,2,3,4,5);
            List<Integer> schedule3 = Arrays.asList(1,6,8,2,4);
            List<Integer> schedule4 = Arrays.asList(1,16,21,2,5);
            List<List<Integer>> tests= new ArrayList<>();
            tests.add(schedule1);
            tests.add(schedule2);
            tests.add(schedule3);
            tests.add(schedule4);

            for (List<Integer> schedules : tests) {
                Collections.sort(schedules);
                WaitTime waitTimes = scheduleStudents(schedules, 5, 3, 4);
                System.out.println("minWaitTIme:" + waitTimes.minWaitTIme + ",minTotalWaitTime:" + waitTimes.minTotalWaitTime);
            }
        }
    }
    class WaitTime {

        Integer minWaitTIme;
        Integer minTotalWaitTime;

        public WaitTime(Integer minWaitTIme,Integer minTotalWaitTime){
            this.minWaitTIme=minWaitTIme;
            this.minTotalWaitTime=minTotalWaitTime;
        }
    }

