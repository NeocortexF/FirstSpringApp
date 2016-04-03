package chpt4;

public class TemperatureConverter {
	
	public String convertTemp(int temperature, char convertTo){
		
		String result;
		
		switch (convertTo){
		
		case 'F':
			System.out.println("�������� �������� ����������� " + temperature + " �� �������� ������� � ������� ����������");
			temperature = (temperature * 9/5) + 32;
			System.out.println("���������:" + temperature);
			break;
			
		case 'C':
			System.out.println("�������� ����������� " + temperature + " �� �������� ���������� � ������� �������");
			temperature = (temperature - 32) * 5/9;
			System.out.println("���������:" + temperature);
			break;
			
		}
		result = "����������� ������� ���������������! " + temperature;
		return result;
	}

	public static void main(String[] args) {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		tc.convertTemp(100, 'F');
		tc.convertTemp(200, 'C');
			
	}

}
