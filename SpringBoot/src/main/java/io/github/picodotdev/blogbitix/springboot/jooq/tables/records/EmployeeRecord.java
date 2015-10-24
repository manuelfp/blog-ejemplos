/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import io.github.picodotdev.blogbitix.springboot.jooq.tables.Employee;
import io.github.picodotdev.blogbitix.springboot.jooq.tables.interfaces.IEmployee;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeRecord extends UpdatableRecordImpl<EmployeeRecord> implements Record4<Long, String, String, DateTime>, IEmployee {

	private static final long serialVersionUID = 1638531785;

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.ID</code>.
	 */
	@Override
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.ID</code>.
	 */
	@NotNull
	@Override
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.NAME</code>.
	 */
	@Override
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.NAME</code>.
	 */
	@Size(max = 256)
	@Override
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.SURNAME</code>.
	 */
	@Override
	public void setSurname(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.SURNAME</code>.
	 */
	@Size(max = 256)
	@Override
	public String getSurname() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.BIRTHDAY</code>.
	 */
	@Override
	public void setBirthday(DateTime value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.BIRTHDAY</code>.
	 */
	@Override
	public DateTime getBirthday() {
		return (DateTime) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, String, String, DateTime> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, String, String, DateTime> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Employee.EMPLOYEE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Employee.EMPLOYEE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Employee.EMPLOYEE.SURNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<DateTime> field4() {
		return Employee.EMPLOYEE.BIRTHDAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getSurname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DateTime value4() {
		return getBirthday();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value3(String value) {
		setSurname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value4(DateTime value) {
		setBirthday(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord values(Long value1, String value2, String value3, DateTime value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IEmployee from) {
		setId(from.getId());
		setName(from.getName());
		setSurname(from.getSurname());
		setBirthday(from.getBirthday());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IEmployee> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmployeeRecord
	 */
	public EmployeeRecord() {
		super(Employee.EMPLOYEE);
	}

	/**
	 * Create a detached, initialised EmployeeRecord
	 */
	public EmployeeRecord(Long id, String name, String surname, DateTime birthday) {
		super(Employee.EMPLOYEE);

		setValue(0, id);
		setValue(1, name);
		setValue(2, surname);
		setValue(3, birthday);
	}
}