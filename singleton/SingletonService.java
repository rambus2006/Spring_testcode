package hello.core.singleton;

public class SingletonService {
    private static final SingletonService intstance = new SingletonService();

    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    public static SingletonService getInstance(){
        return intstance;
    }
    //2, public 으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    private SingletonService(){

    }
    //3. 생성자를 private 으로 선언해서 외부에서 new에서 호출
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
