package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final Boolean addcontent;

    public Greeting(long id, String content,Boolean addcontent) {
        this.id = id;
        this.content = content;
        this.addcontent = addcontent;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAddContent(){

    	if(addcontent){
    		return "RESTful WEB Service 実験";
    	}else{
    		return "失敗_git";
    	}
    }
}