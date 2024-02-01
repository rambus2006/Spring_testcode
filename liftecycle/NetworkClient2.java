package hello.core.liftecycle;

public interface NetworkClient2 {
    void setUrl(String url);

    //서비스 시작시 호출
    void connect();

    void call(String message);

    //서비스 종료시 호출
    void disconnect();

    void afterPropertiesSet() throws Exception;

    void destroy() throws Exception;
}
