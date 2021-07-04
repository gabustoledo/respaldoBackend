package com.mingeso.backend.models;

public class Diplomado {

    private Integer id;
    private String nombre;
    private String objetivo;
    private String plan_de_estudio;
    private String cuerpo_docente;
	private String arancel;
	private String admision;
	private String contacto;
	private String folleto;

    //Get y Set id
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
 
    //Get y Set nombre
    public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
				this.nombre = nombre;
		}

		//Get y Set objetivo
    public String getObjetivo() {
			return objetivo;
		}
		public void setObjetivo(String objetivo) {
				this.objetivo = objetivo;
		}

		//Get y Set planDeEstudio
    public String getPlanDeEstudio() {
			return plan_de_estudio;
		}
		public void setPlanDeEstudio(String plan_de_estudio) {
				this.plan_de_estudio = plan_de_estudio;
		}

		//Get y Set cuerpoDocente
    public String getCuerpoDocente() {
			return cuerpo_docente;
		}
		public void setCuerpoDocente(String cuerpo_docente) {
				this.cuerpo_docente = cuerpo_docente;
		}

		//Get y Set arancel
    public String getArancel() {
			return arancel;
		}
		public void setArancel(String arancel) {
				this.arancel = arancel;
		}

		//Get y Set admision
    public String getAdmision() {
			return admision;
		}
		public void setAdmision(String admision) {
				this.admision = admision;
		}

		//Get y Set cuerpoDocente
    public String getContacto() {
			return contacto;
		}
		public void setContacto(String contacto) {
				this.contacto = contacto;
		}

		//Get y Set cuerpoDocente
    public String getFolleto() {
			return folleto;
		}
		public void setFolleto(String folleto) {
				this.folleto = folleto;
		}
}