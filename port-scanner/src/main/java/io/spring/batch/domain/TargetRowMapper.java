package io.spring.batch.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * A {@link RowMapper} implementation used to map rows from the
 * Target database table to the {@link Target} class.
 * 
 * @author Michael Minella
 *
 */
public class TargetRowMapper implements RowMapper<Target> {

	@Override
	public Target mapRow(ResultSet rs, int rowNum) throws SQLException {
		Target result = new Target();

		result.setBanner(rs.getString("banner"));
		result.setConnected(rs.getBoolean("connected"));
		result.setId(rs.getLong("id"));
		result.setPort(rs.getInt("port"));
		result.setIp(rs.getString("ip"));

		return result;
	}

}
