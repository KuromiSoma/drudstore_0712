package org.drug.store.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.drug.store.ptuketukelist.PtUketuke;

@Mapper
public class PtUketukeMapper {
	public static List<PtUketuke> selectAll();
}
