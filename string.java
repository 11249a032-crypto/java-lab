public Class StringFunctionsDemo{
public static void main(String[] args)
{
    String str1="java programming lab";
    String str2="java programming lab";
    String str3="2nd java lab";
    System.out.println("Original String:"+str1);
    System.out.println("Length:"+str1.length());
    System.out.println("Character at index 5:"+str1.charAt(5));
    System.out.println("Substring(5):"+str1.substring(5));
    System.out.println("Substring(5,11):"+str1.substring(5,11));
    System.out.println("Concatenation:"+str1.concat("language"));
    System.out.println("Equals:"+str1.equals(str2));
    System.out.println("Equals ignore case:"+str1.equalsIgnoreCase(str2));
    System.out.println("compare to ignore case:"+str1.compareToIgnoreCase(str2));
    System.out.println("Contains 'java':"+str1.contains("java"));
    System.out.println("Starts with 'java':"+str1.startsWith("java"));
    System.out.println("Ends with 'java':"+str1.endsWith("java"));
    System.out.println("Ends with lab:"+str1.endsWith("lab"));
    System.out.println("Index of 'p':"+str1.indexOf('p'));
    System.out.println("Last Index of 'a':"+str1.lastIndexOf('a'));
    System.out.println("Replace java with HTML:"+str1.replace("java","HTML"));
    System.out.println("Replace All vowels:"+str1.replaceAll("[AEIOUaeiou]","*"));
    System.out.println("Upper case:"+str1.toUpperCase());
    System.out.println("Lower case:"+str1.toLowerCase());
    System.out.println("Trim:"+str3.trim()+"");
    String str4="";
    System.out.println("ISempty:"+str4.isEmpty());
    String[] words=str1.split("");
    System.out.println("Split:");
    for(String word:words){
        System.out.println(word);
    }
    int num=100;
    String s=String.valueOf(num);
    System.out.println("valueOf():"+s);
    char[] ch=str1.toCharArray();
    System.out.println("Character Array:");
    for(char c:ch){
        System.out.print(c+"");
    }
    String joined=String.join("-","java","python","C++");
    System.out.println("join:"+joined);
    StringBuilder sb=new StringBuilder();
for (int i = 0; i < 3; i++) {
    sb.append("Hi");
}
System.out.println("Repeat: " + sb.toString());
    }
}
