package Instance;

public class Q07NewComer {
	private String name;
	private int age;
    public void setName( String nm ){
        name = nm;
    }
    public void setAge( int ag ){
        age = ag;
    }
    public void showProfile() {
        System.out.println( "私の名前は、" + name + "です。" );
        System.out.println( "年齢は、" + age + "歳です。" );
    }
}
