/*
������(constructor)
1. Ŭ���� �̸��������ϸ� ����Ÿ���� ��������ʴ� �޽��(???)
2. �ϳ��� Ŭ�������� �ݵ�� �ϳ��̻��� �����ڰ� �����Ͽ����Ѵ�
--> �����ڸ� ��������������� �����Ϸ��� ���ڰ��ϳ�������
    ������(������ ������)�� �ڵ����� �־ �������Ѵ�.    
3. ��ü������ ���ѹ� ȣ��ȴ�.
4. �ַ� ��ü�ʱ�ȭ�� �뵵�� ����Ѵ�.
5. ��ü�� �����ҷ��� �ݵ�� �����ڸ� ȣ���Ͽ����Ѵ�.
	
	-����: 
	 	public class Test{
	 		//�������� ����(����)
	 	    public Test(){
	 	    }
	 	}
	 	
    -���: 
           Test t = new Test(); 
	 	   Ŭ������ ���������̸� = new Ŭ������();
	 	   new ��� �����ڴ� �ݵ�� ������ �տ��־���ϸ�
	 	   �̿����ڿ����� ��ü�� �����Ѵ�.
*/

public class Constructor {
	public int i;
	public int j;
	/*
	 * ���ڰ��ϳ��� ���� ������ --> ����Ʈ ������
	 */
	//�������� ����(����)
	public Constructor(){
		System.out.println("Constructor() ����");
		this.i=100;
		this.j=101;
	}
	public Constructor(int i){
		System.out.println("Constructor(int i) ���� ");
		this.i=i;
		this.j=102;
	}
	public Constructor(int i , int j){
		System.out.println("Constructor(int i , int j) int");
		this.i=i;
		this.j=j;
	}
	public void print(){
		System.out.println("i=" + this.i);
		System.out.println("j=" + this.j);
	}
}
