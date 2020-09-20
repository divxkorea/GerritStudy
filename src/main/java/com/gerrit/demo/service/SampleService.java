package com.gerrit.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gerrit.demo.entity.SampleVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SampleService {

	public void setPeformTest() throws Exception {
		
		List<SampleVo> sampleList = new ArrayList<>();
		
		for (int i = 1; i <= 1000000; i++) {
			SampleVo objData = new SampleVo();
			objData.setUserNo(i);
			objData.setUserName("테스트"+i);
			sampleList.add( objData );
		}
		
		log.info("ArraySize:{}", sampleList.size() );
		
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		// 이터레이티를 이용해서 특정 요소 찾기
		Iterator<SampleVo> iter = sampleList.iterator();
		while ( iter.hasNext() ) {
			SampleVo objInfo = iter.next();
			if("테스트55470".equals(objInfo.getUserName())) {
				long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
				long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
				log.info("수행시간:{},값:{}", secDiffTime, objInfo.getUserName());
			}
			
		}
	}
}
