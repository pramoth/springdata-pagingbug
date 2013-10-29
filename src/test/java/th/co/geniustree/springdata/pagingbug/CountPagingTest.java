/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.springdata.pagingbug;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import th.co.geniustree.springdata.pagingbug.repo.StudenRepo;

/**
 *
 * @author pramoth
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CountPagingTest {

    @Autowired
    private StudenRepo studenRepo;

    public CountPagingTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void simpleSelectWithPagingCauseSqlCountSyntaxError() {
        Page<Object> findWithScalarSelect = studenRepo.findWithScalarSelect(new PageRequest(0, 10));
        assertNotNull(findWithScalarSelect);
    }
}
