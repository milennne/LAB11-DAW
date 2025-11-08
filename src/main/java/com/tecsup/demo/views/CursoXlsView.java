package com.tecsup.demo.views;

import java.util.List;
import java.util.Map;

import com.tecsup.demo.domain.entities.Curso;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;





@Component("curso/ver.xlsx")
public class CursoXlsView extends AbstractXlsxView {
    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook,
                                      HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setHeader("Content-Disposition", "attachment;filename=\"curso_view.xlsx\"");
        List<Curso> cursos = (List<Curso>) model.get("cursos");
        Sheet sheet = workbook.createSheet("Lista de Cursos");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Lista de Cursos");

        CellStyle theaderStyle = workbook.createCellStyle();
        theaderStyle.setBorderBottom(BorderStyle.MEDIUM);
        theaderStyle.setBorderTop(BorderStyle.MEDIUM);
        theaderStyle.setBorderRight(BorderStyle.MEDIUM);
        theaderStyle.setBorderLeft(BorderStyle.MEDIUM);
        theaderStyle.setFillForegroundColor(IndexedColors.GOLD.index);
        theaderStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle tbodyStyle = workbook.createCellStyle();
        tbodyStyle.setBorderBottom(BorderStyle.THIN);
        tbodyStyle.setBorderTop(BorderStyle.THIN);
        tbodyStyle.setBorderRight(BorderStyle.THIN);
        tbodyStyle.setBorderLeft(BorderStyle.THIN);

        Row header = sheet.createRow(2);
        header.createCell(0).setCellValue("id");
        header.createCell(1).setCellValue("nombre");
        header.createCell(2).setCellValue("creditos");

        header.getCell(0).setCellStyle(theaderStyle);
        header.getCell(1).setCellStyle(theaderStyle);
        header.getCell(2).setCellStyle(theaderStyle);

        int rownum = 3;
        for (Curso curso : cursos) {
            Row fila = sheet.createRow(rownum++);
            Cell celda = fila.createCell(0);
            celda.setCellValue(curso.getId());
            celda.setCellStyle(tbodyStyle);

            celda = fila.createCell(1);
            celda.setCellValue(curso.getNombre());
            celda.setCellStyle(tbodyStyle);

            celda = fila.createCell(2);
            celda.setCellValue(curso.getCreditos());
            celda.setCellStyle(tbodyStyle);
        }
    }
}
