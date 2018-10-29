package com.abhioncbr.etlFramework.commons.extract

import com.abhioncbr.etlFramework.commons.common.file.FilePath
import com.abhioncbr.etlFramework.commons.common.query.QueryObject

case class Extract(feeds: Array[Feed])
case class Feed(feedName: String,
                extractionType: ExtractionType.valueType,
                extractionSubType: String,
                dataPath: Option[FilePath], //fileInitialPath: String, fileNamePattern: String, formatFileName: Boolean, filePrefix: String,
                query: Option[QueryObject], //dbPropertyFile: String, queryFilePath: String, queryParams: List[QueryParam],
                validateExtractedData: Boolean)
