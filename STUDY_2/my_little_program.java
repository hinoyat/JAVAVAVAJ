import java.util.HashMap;
import java.util.Scanner;

public class CapitalFinder {
    private HashMap<String, String> countryCapitalMap;

    public CapitalFinder() {
        countryCapitalMap = new HashMap<>();
        initializeCapitals();
    }

    private void initializeCapitals() {
        countryCapitalMap.put("한국", "서울");
        countryCapitalMap.put("미국", "워싱턴 D.C.");
        countryCapitalMap.put("영국", "런던");
        countryCapitalMap.put("일본", "도쿄");
        countryCapitalMap.put("프랑스", "파리");
        // 다른 국가와 수도 추가 가능
    }

    public String findCapital(String country) {
        return countryCapitalMap.getOrDefault(country, "수도를 찾을 수 없습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CapitalFinder capitalFinder = new CapitalFinder();

        while (true) {
            System.out.print("국가 이름을 입력하세요 (종료하려면 'exit' 입력): ");
            String country = scanner.nextLine().trim();
            
            if (country.equalsIgnoreCase("exit")) {
                break;
            }

            String capital = capitalFinder.findCapital(country);
            System.out.println("수도: " + capital);
        }
        
        scanner.close();
    }
}
