import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderEx {
    public static void main(String[] args){
        try{
            FileReader fin = new FileReader("../proj0328/unrequited.txt");
            // 버퍼 스트림 추가 -> 성능 개선
            BufferedReader bfin = new BufferedReader(fin);
            int c;
            while((c = bfin.read()) != -1){
                System.out.print((char)c);
            }
            fin.close();
            bfin.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없대요...");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("읽기 에러");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("기타 에러");
            e.printStackTrace();
        }

    }
}
