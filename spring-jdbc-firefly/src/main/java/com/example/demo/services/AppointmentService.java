package com.example.demo.services;

import com.example.demo.data.AppointmentDTO;
import com.example.demo.data.PatientDTO;
import com.example.demo.exception.PatientAlreadyExistsException;
import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@PropertySource("classpath:db/queries/appointment.properties")
public class AppointmentService {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    //@Autowired
    // JdbcTemplate simpleJDBCTemplate;

    @Value("${appointment.add}")
    private String ADD_APPOINTMENT_SQL;

    @Value("${patient.appointment}")
    private String GET_PATIENT_APPOINTMENT;

    public List<AppointmentDTO> getPatientAppointment(int patientID){
        ResultSetExtractor<List<AppointmentDTO>> mapper = JdbcTemplateMapperFactory.newInstance()
                .addKeys("patient_id")
                .ignorePropertyNotFound()
                .newResultSetExtractor(AppointmentDTO.class);
        SqlParameterSource namedParameters = new MapSqlParameterSource("patient_id", patientID);

        return jdbcTemplate.query(GET_PATIENT_APPOINTMENT, namedParameters, mapper);
    }

    public Long addAppointment(AppointmentDTO appointmentDTO) {
        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("patient_id", appointmentDTO.getPatient_id())
                .addValue("examination_room_id", appointmentDTO.getExamination_room_id())
                .addValue("physician_id", appointmentDTO.getPhysician_id());
        KeyHolder holder = new GeneratedKeyHolder();

        jdbcTemplate.update(ADD_APPOINTMENT_SQL,
                params,
                holder,new String[] { "appointment_id" });
        return holder.getKey().longValue();
    }
}
