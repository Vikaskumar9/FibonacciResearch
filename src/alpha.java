public class alpha {

    public static void main(String[] args){
            String he = converString("abcdefgh");

            System.out.println("final String" + he);


    }

    public static String converString(String name){
       // String str = "abcdefgh";
        char n;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<name.length();i++){
            if (name.charAt(i)  % 2 ==1){
                char convert = name.charAt(i);
                n = Character.toUpperCase(convert);
                sb.append(n);
                System.out.println("here's the string=" + Character.toUpperCase(convert));
            } else{
                System.out.println("here's the string=" + name.charAt(i));
                sb.append(name.charAt(i));
            }

        }
        return name;
    }

}
