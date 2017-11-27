--BUSCA PRODUTOS PRODUZIDOS COM NOME E QUANTIDADE

SELECT 
ITENSORDEMPRODUCAO.CODIGO_ITEM,
PRODUTOS.NOME,
ITENSORDEMPRODUCAO.QTD_PRODUZIDA,
ITENSORDEMPRODUCAO.CUSTO_UNITARIO,
ITENSORDEMPRODUCAO.CUSTO_TOTAL
FROM PRODUTOS, ITENSORDEMPRODUCAO
WHERE PRODUTOS.CODIGO = ITENSORDEMPRODUCAO.CODIGO_ITEM

--LISTA COMPONENTES DA COMPOSICAO

SELECT
P.NOME,
C.QTD_COMPONENTE
FROM PRODUTOS P, COMPOSICAO C
WHERE P.CODIGO = C.CODIGO_COMPONENTE
AND C.CODIGO_PRODUTO = '1';

--LISTA PRODUTOS DA ORDEM DE PRODUCAO

SELECT
O.NUMERO,
P.CODIGO,
P.NOME,
I.QTD_PRODUZIDA,
I.CUSTO_TOTAL
FROM PRODUTOS P, ITENSORDEMPRODUCAO I, ORDEMPRODUCAO O
WHERE P.CODIGO = I.CODIGO_ITEM
AND I.NUMERO_ORDEM = O.NUMERO
AND O.NUMERO = 2;