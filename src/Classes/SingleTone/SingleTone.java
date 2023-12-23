package Classes.SingleTone;

public class SingleTone {

    private static SingleTone obj;
    public static SingleTone getInstance(){
        if(obj==null){
            obj=new SingleTone();
        }
        return obj;
    }



    private String data;

    private SingleTone(){}


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}

