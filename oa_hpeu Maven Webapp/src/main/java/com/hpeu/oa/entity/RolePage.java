package com.hpeu.oa.entity;

import java.util.Set;

public class RolePage {
	 private int id;
	    //角色
	    private Set<Role> roles;
	    //页面路径
	    private Set<PageResource> pageResources;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public Set<Role> getRoles() {
	        return roles;
	    }

	    public void setRoles(Set<Role> roles) {
	        this.roles = roles;
	    }

	    public Set<PageResource> getPageResources() {
	        return pageResources;
	    }

	    public void setPageResources(Set<PageResource> pageResources) {
	        this.pageResources = pageResources;
	    }
}
