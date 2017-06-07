package cn.edu.ncut.model;

import java.util.List;

public class ModelObj {
    private Integer modelid;

    private String modelname;

    private String modeldesc;

    private Integer parentid;

    private Integer modelstatus;

    private Integer sortnum;

    private List<RolemodelObj> objList;

    public List<RolemodelObj> getObjList() {
        return objList;
    }

    public void setObjList(List<RolemodelObj> objList) {
        this.objList = objList;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }

    public String getModeldesc() {
        return modeldesc;
    }

    public void setModeldesc(String modeldesc) {
        this.modeldesc = modeldesc == null ? null : modeldesc.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getModelstatus() {
        return modelstatus;
    }

    public void setModelstatus(Integer modelstatus) {
        this.modelstatus = modelstatus;
    }

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }
}