
package com.mycompany.tarea3;

/**
 *
 * @author MarcoNúñez
 */
public class Fotografo {
    private String identidad;
    private String name;
    private String modelCam;
    private String nickName;
    private String webSite;
    private String style;
    private String workExp;
    
    //Constructor por defecto
    
    public Fotografo(){
        
    }
    
    //Constructor personalizado o con parámetros
    public Fotografo(String identidad, String name, String modelCam, String nickName){
        this.setIdentidad(identidad);
        this.setName(name);
        this.setmodelCam(modelCam);
        this.setnickName(nickName);
        this.setwebSite(webSite);
        this.setstyle(style);
        this.setworkExp(workExp);
        
    }
    
    //Métodos para obtener la información del fotógrafo
    public String getIdentidad(){
        return identidad;
    }
    
    public String getname(){
        return name;
    }
    
    public String getmodelCam(){
        return modelCam;
    }
    
    public String getnickName(){
        return nickName;
    }
    
    public String getwebSite(){
        return webSite;
    }
    
    public String getstyle(){
        return style;
    }
    
    public String getworkExp(){
        return workExp;
    }
    
    
    //Métodos para establecer
     public void setIdentidad(String _identidad){
        this.identidad = _identidad;
    }
    
    public void setName(String _name){
        this.name = _name; 
    }
    
    public void setmodelCam(String _modelCam){
        this.modelCam = _modelCam;
    }
    
    public void setnickName(String _nickName){
        this.nickName = _nickName;
    }
    
    public void setwebSite(String _webSite){
        this.webSite = _webSite;
    }
    
    public void setstyle(String _style){
        this.style = _style;
    }
    
    public void setworkExp(String _workExp){
        this.workExp = _workExp;
    }
    

    
}
