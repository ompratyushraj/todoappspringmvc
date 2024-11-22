package entities;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Todo {
	private String todoTitle;
	private String todoContent;
	private Date todoDate;
	
	@Override
	public String toString() {
		return this.getTodoTitle()+ " : " + this.getTodoContent();
	}
}
