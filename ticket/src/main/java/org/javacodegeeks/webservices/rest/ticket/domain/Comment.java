package org.javacodegeeks.webservices.rest.ticket.domain;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 
import com.fasterxml.jackson.annotation.JsonIgnore;
 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@Getter @Setter @NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Comentario")
    private Long commentId;
     
    private String text;
     
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Ticket")
    @JsonIgnore
    private Ticket ticket;

	public void setTicket(Object object) {
		// TODO Auto-generated method stub
		
	}

	public Object getText() {
		// TODO Auto-generated method stub
		return null;
	}
}