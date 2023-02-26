package org.javacodegeeks.webservices.rest.ticket.domain;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@Getter @Setter @NoArgsConstructor
public class Ticket {
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="TICKET_ID")
    private Long ticketId;
     
    private String description;
     
    @OneToMany(mappedBy="ticket", cascade=CascadeType.ALL)
    private List comments = new ArrayList();

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}

	public List getComments() {
		// TODO Auto-generated method stub
		return null;
	}
}