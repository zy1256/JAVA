/**
 * �����忡�� ����ϴ� ����ü�� �߻�ȭ�� Ŭ����
 * @author Administrator
 *
 */
public class Car {
	
	/**
	 * ������ȣ
	 */
	public String no; //������ȣ
	/**
	 * �����ð�
	 */
	public int inTime; // �����ð�
	/**
	 * �����ð�
	 */
	public int outTime; // �����ð�
	/**
	 * �������
	 */
	public int fee; //�������
	
	//����޽��(����)
	
	//�Է�
	//���
	/**
	 * ���
	 */
	public void print(){
		
		//this : self ��������
		
		System.out.println("----------------------");
		System.out.println("������ȣ : " + this.no);
		System.out.println("�����ð� : " + this.inTime);
		System.out.println("�����ð� : " + this.outTime);
		System.out.println("������� : " + this.fee);
		System.out.println("-----------------");
		
	}
	
	//������ݰ��
	public void calculaterFee(){
		this.fee=(this.outTime-this.inTime)*1000;
	}

}
