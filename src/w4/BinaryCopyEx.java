import java.io.*;

public class BinaryCopyEx {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("../proj0328/img1.jpeg");  // 파일을 읽기 위해 img1과 연결하기
            FileOutputStream fout = new FileOutputStream("../proj0328/copy2.jpeg"); // img1을 copy로 복사하여 저장
            // 버퍼 스트림 추가 -> 성능 개선
            BufferedInputStream bfin = new BufferedInputStream(fin);
            BufferedOutputStream bfout = new BufferedOutputStream(fout);
            int c;
            while((c = bfin.read()) != -1) {
                bfout.write((byte)c);
            }
            System.out.println("파일 복사 완료...");
            fin.close();
            bfin.close();
            bfout.close();
            fout.close();
        } catch(FileNotFoundException e) {
            System.out.println("그 위치에 파일이 없어요...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("읽고 쓰다가 에러 났어요...");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("기타 에러...");
            e.printStackTrace();
        }
    }
}
