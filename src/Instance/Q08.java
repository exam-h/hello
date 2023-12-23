package Instance;

class Q08 {
    // mainメソッドを追加する
    public static void main(String[] args) {
        // NewComer1クラスのインスタンスを生成する
    	Q08NewComer [] members = new Q08NewComer [4];
    	members [0] = new Q08NewComer ();
        members [1] = new Q08NewComer ();
        members [2] = new Q08NewComer ();
        members [3] = new Q08NewComer ();
        // setNameメソッドで名前を設定する
        members [0].setName("オレガ");
        members [0].setAge(29);
        members [1].setName("ツカ");
        members [1].setAge(31);
        members [2].setName("ヤマsaga");
        members [2].setAge(45);
        members [3].setName("コウ");
        members [3].setAge(00);
        // showProfileメソッドで名前を表示する
        // 各オブジェクトのプロフィールを表示
        for(int i=0;i<members.length;i++) {
            members [i].showProfile();
            System.out.println("---------------------");
        }
    }
}
	