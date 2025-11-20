import java.util.*;

public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> ip = new HashMap<>();
        ip.put("myId", "myPass");
        ip.put("myId2", "myPass2");
        ip.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = sc.next();

            if (ip.containsKey(id.trim()) == true) {
                System.out.print("password: ");
                String password = sc.next();

                if (password.trim().equals(ip.get(id.trim()))) {
                    System.out.println("id와 비밀번호가 일치합니다.\n");
                    break;
                } 
                
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }

            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }
        sc.close();
    }
}