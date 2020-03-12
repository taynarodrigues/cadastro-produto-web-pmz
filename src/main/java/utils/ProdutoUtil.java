package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProdutoUtil {
	
	private static Map<String, String> map = new HashMap<String, String>();
	
	static Random random = new Random();
	
	public static Map<String, String>getDadosProduto(){
		
		map.clear();
		map.put("codigo_forn", "PSC452");
		map.clear();
		map.put("descricao_compl", "PRE-LANCAMENTO");
		map.put("complemento", "LANCAMENTO");
		map.put("observacao", "TESTERPMZ");
		map.put("coefreducao", "1");
		map.put("coefsubst", "1");
		map.put("extipi", "1");
		map.put("classfiscal", "84212990");
		map.put("cest", "1");
		map.put("minimo", "1");
		map.put("embalagem", "6");
		map.put("peso_liquido", "0,834");
		map.put("embalagem_venda", "2");
		map.put("peso_bruto", "0,9");
		map.put("ipi", "0");
		map.put("decimais", "0");
		map.put("conversao_vd_cp", "1");

		return map;
	}

}
