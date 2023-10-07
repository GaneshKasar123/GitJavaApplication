import java.util.HashSet;
import java.util.Set;
public class ConsectiveDuplicateCharacter{
public static void main (String arg[]){
String str="ssgfhfhdccbggdbh";
Set<Character> hs=new HashSet<>();
for(int i=0; i<str.length();i++)
hs.add(str.charAt(i));
hs.forEach(System.out::println);


}
}