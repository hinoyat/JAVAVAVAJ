import java.util.HashMap;
import java.util.Scanner;

public class CapitalFinder {
    private HashMap<String, String> countryCapitalMap;

    public CapitalFinder() {
        countryCapitalMap = new HashMap<>();
        initializeCapitals();
    }

    private void initializeCapitals() {
        countryCapitalMap.put("�ѱ�", "����");
        countryCapitalMap.put("�̱�", "������ D.C.");
        countryCapitalMap.put("����", "����");
        countryCapitalMap.put("�Ϻ�", "����");
        countryCapitalMap.put("������", "�ĸ�");
        // �ٸ� ������ ���� �߰� ����
    }

    public String findCapital(String country) {
        return countryCapitalMap.getOrDefault(country, "������ ã�� �� �����ϴ�.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CapitalFinder capitalFinder = new CapitalFinder();

        while (true) {
            System.out.print("���� �̸��� �Է��ϼ��� (�����Ϸ��� 'exit' �Է�): ");
            String country = scanner.nextLine().trim();
            
            if (country.equalsIgnoreCase("exit")) {
                break;
            }

            String capital = capitalFinder.findCapital(country);
            System.out.println("����: " + capital);
        }
        
        scanner.close();
    }
}
