public class StringFunctionsDemo {
public static void main(String[] args) {

String str1 = &quot;Java Programming&quot;;
String str2 = &quot;java programming&quot;;
String str3 = &quot; Welcome to Java &quot;;

System.out.println(&quot;Original String: &quot; + str1);

System.out.println(&quot;Length: &quot; + str1.length());

System.out.println(&quot;Character at index 5: &quot; + str1.charAt(5));

System.out.println(&quot;Substring(5): &quot; + str1.substring(5));
System.out.println(&quot;Substring(5,11): &quot; + str1.substring(5,11));

System.out.println(&quot;Concatenation: &quot; + str1.concat(&quot; Language&quot;));

System.out.println(&quot;Equals: &quot; + str1.equals(str2));

System.out.println(&quot;Equals Ignore Case: &quot; + str1.equalsIgnoreCase(str2));

System.out.println(&quot;CompareTo: &quot; + str1.compareTo(str2));

System.out.println(&quot;CompareTo Ignore Case: &quot; + str1.compareToIgnoreCase(str2));

System.out.println(&quot;Contains &#39;Java&#39;: &quot; + str1.contains(&quot;Java&quot;));

System.out.println(&quot;Starts With &#39;Java&#39;: &quot; + str1.startsWith(&quot;Java&quot;));

System.out.println(&quot;Ends With &#39;ming&#39;: &quot; + str1.endsWith(&quot;ming&quot;));

System.out.println(&quot;Index of &#39;P&#39;: &quot; + str1.indexOf(&#39;P&#39;));

System.out.println(&quot;Last Index of &#39;a&#39;: &quot; + str1.lastIndexOf(&#39;a&#39;));

System.out.println(&quot;Replace Java with Python: &quot; + str1.replace(&quot;Java&quot;,&quot;Python&quot;));

System.out.println(&quot;ReplaceAll vowels: &quot; + str1.replaceAll(&quot;[AEIOUaeiou]&quot;, &quot;*&quot;));

System.out.println(&quot;Upper Case: &quot; + str1.toUpperCase());

System.out.println(&quot;Lower Case: &quot; + str1.toLowerCase());

System.out.println(&quot;Trim: &#39;&quot; + str3.trim() + &quot;&#39;&quot;);

String str4 = &quot;&quot;;
System.out.println(&quot;Is Empty: &quot; + str4.isEmpty());

String[] words = str1.split(&quot; &quot;);
System.out.println(&quot;Split:&quot;);
for(String word : words){
System.out.println(word);

}

int num = 100;
String s = String.valueOf(num);
System.out.println(&quot;ValueOf(): &quot; + s);

char[] ch = str1.toCharArray();
System.out.println(&quot;Character Array:&quot;);
for(char c : ch){
System.out.print(c + &quot; &quot;);
}

System.out.println();

String joined = String.join(&quot;-&quot;, &quot;Java&quot;,&quot;Python&quot;,&quot;C++&quot;);
System.out.println(&quot;Join: &quot; + joined);

System.out.println(&quot;Repeat: &quot; + &quot;Hi &quot;.repeat(3));

}
}