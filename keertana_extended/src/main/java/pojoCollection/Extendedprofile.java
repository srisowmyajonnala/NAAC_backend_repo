package pojoCollection;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="AutonomousCollege")
public class Extendedprofile {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="college_id")
private long college_id;

@Column(name="Year")
private String year1;

@Column(name="Number")
private String number;



}
