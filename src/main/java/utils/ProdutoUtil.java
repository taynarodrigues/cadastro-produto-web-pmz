package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProdutoUtil {
	
	private static Map<String, String> map = new HashMap<String, String>();
	
	static Random random = new Random();
	
	public static Map<String, String>getDadosProduto(){
		
		map.clear();
		map.put("codigo_forn", "ACP");
		map.put("descricao_compl", "");
		map.put("complemento", "ACP");
		map.put("observacao", "LANCAMENTO");
		map.put("coefreducao", "");
		map.put("coefsubst", "");
		map.put("extipi", "");
		map.put("classfiscal", "84212990");
		map.put("cest", "");
		map.put("minimo", "");
		map.put("embalagem", "");
		map.put("peso_liquido", "");
		map.put("embalagem_venda", "");
		map.put("peso_bruto", "");
		map.put("ipi", "");
		map.put("decimais", "");
		map.put("conversao_vd_cp", "");

		return map;
	}

	public static Map<String, String> getCamposProduto() {
		
		map.put("grupo_comissao", "6 - PNEUS ESPECIAIS");
		map.put("estoque", "SIM");
		map.put("ativo", "SIM");
		map.put("icms_proprio", "SIM");
		map.put("imposto", "4 - Prod.Nac.Isento N/Tributado");
		map.put("abandonado", "PEMAZA");
		map.put("unidade_compra", "BD - BALDE");
		map.put("unidade_venda", "CX - CAIXA");
		map.put("unidade_transf", "CX - CAIXA");
		
		return map;
	}

}
