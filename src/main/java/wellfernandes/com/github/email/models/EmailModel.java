package wellfernandes.com.github.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import wellfernandes.com.github.email.enums.StatusEmail;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emailId;

	private String ownerRef;
	private String emailFrom;
	private String emailTo;
	private String subject;

	@Column(columnDefinition = "TEXT")
	private String text;

	private LocalDateTime sendDataEmail;
	private StatusEmail statusEmail;
}
