package java.com.imooc.o2o.dao;

import com.imooc.o2o.dao.AreaDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.com.imooc.o2o.BaseTest;
import java.util.List;

public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
//        assertEquals(2,((List) areaList).size());
    }
}
