class Main {
    public static void main(String[] args) {
        
        String name = "   Abu Ibraheem   ";
        int length = name.length();
        char letter = name.charAt(4);
        int index = name.indexOf("e");
        int lastIndex = name.lastIndexOf("e");
        
        
        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("I", "E");
        
        /*
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());
        
        
        if(name.isEmpty()) {
            System.out.println("Your name is empty!");
        }
        else {
            System.out.println("Hello " + name);
        }
        
        if(name.contains(" ")) {
            System.out.println("Your name contains spaces");
        }
        else{
            System.out.println("Your name doesn't contain any spaces");
        }
        */
        
        if(name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }   
}