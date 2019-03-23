package Wzorce;

class RawText implements Decor {

    private String key;
    private String val;

    public RawText(String key, String val){
        this.key = key;
        this.val = val;
    }
    public String getText(){
        return this.key+"_"+this.val;
    }
}
