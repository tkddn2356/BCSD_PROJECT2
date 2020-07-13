package com.sangwookim.repository;

import lombok.extern.log4j.Log4j;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:../../../../../main/webapp/WEB-INF/dispatcher-servlet.xml", "classpath*:common/*.xml"})
@Log4j
@Repository
public class ReplyMapperTests {

}
