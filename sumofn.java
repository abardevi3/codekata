import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumofn {
public static void main(String[] args) throws IOException {

System.out.println("Input any No.");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String data = (String) br.readLine();
int num = Integer.parseInt(data);
int sum = 0;

for (int i = 1; i <= num; i++) {
sum = sum + i;
}
System.out.println("Sum- " + sum);
}
}
