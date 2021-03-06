PGDMP     	                
    u           producao    9.6.5    9.6.5     i           0    0    ENCODING    ENCODING     #   SET client_encoding = 'SQL_ASCII';
                       false            j           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            k           1262    16393    producao    DATABASE     �   CREATE DATABASE producao WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE producao;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            l           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12387    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            m           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16489 
   composicao    TABLE     �   CREATE TABLE composicao (
    codigo_composicao integer NOT NULL,
    codigo_produto integer NOT NULL,
    codigo_componente integer NOT NULL,
    qtd_componente double precision NOT NULL
);
    DROP TABLE public.composicao;
       public         postgres    false    3            �            1259    16504    itensordemproducao    TABLE       CREATE TABLE itensordemproducao (
    id integer NOT NULL,
    numero_ordem integer NOT NULL,
    codigo_item integer NOT NULL,
    qtd_produzida double precision NOT NULL,
    custo_unitario double precision NOT NULL,
    custo_total double precision NOT NULL
);
 &   DROP TABLE public.itensordemproducao;
       public         postgres    false    3            �            1259    16499    ordemproducao    TABLE     �   CREATE TABLE ordemproducao (
    numero integer NOT NULL,
    descricao character varying(60) NOT NULL,
    data_emissao date NOT NULL,
    data_finalizacao date NOT NULL,
    status boolean NOT NULL
);
 !   DROP TABLE public.ordemproducao;
       public         postgres    false    3            �            1259    16474    produtos    TABLE     �   CREATE TABLE produtos (
    codigo integer NOT NULL,
    nome character varying(100) NOT NULL,
    qtd double precision NOT NULL,
    preco_custo double precision NOT NULL,
    preco_venda double precision NOT NULL,
    tipo_produto integer NOT NULL
);
    DROP TABLE public.produtos;
       public         postgres    false    3            �            1259    16479    tipo_produto    TABLE     i   CREATE TABLE tipo_produto (
    codigo integer NOT NULL,
    descricao character varying(20) NOT NULL
);
     DROP TABLE public.tipo_produto;
       public         postgres    false    3            d          0    16489 
   composicao 
   TABLE DATA               c   COPY composicao (codigo_composicao, codigo_produto, codigo_componente, qtd_componente) FROM stdin;
    public       postgres    false    187          f          0    16504    itensordemproducao 
   TABLE DATA               p   COPY itensordemproducao (id, numero_ordem, codigo_item, qtd_produzida, custo_unitario, custo_total) FROM stdin;
    public       postgres    false    189   a       e          0    16499    ordemproducao 
   TABLE DATA               [   COPY ordemproducao (numero, descricao, data_emissao, data_finalizacao, status) FROM stdin;
    public       postgres    false    188   �       b          0    16474    produtos 
   TABLE DATA               V   COPY produtos (codigo, nome, qtd, preco_custo, preco_venda, tipo_produto) FROM stdin;
    public       postgres    false    185   �       c          0    16479    tipo_produto 
   TABLE DATA               2   COPY tipo_produto (codigo, descricao) FROM stdin;
    public       postgres    false    186   �       �           2606    16493    composicao codigo_composicao_pk 
   CONSTRAINT     e   ALTER TABLE ONLY composicao
    ADD CONSTRAINT codigo_composicao_pk PRIMARY KEY (codigo_composicao);
 I   ALTER TABLE ONLY public.composicao DROP CONSTRAINT codigo_composicao_pk;
       public         postgres    false    187    187            �           2606    16508    itensordemproducao id_pk 
   CONSTRAINT     O   ALTER TABLE ONLY itensordemproducao
    ADD CONSTRAINT id_pk PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.itensordemproducao DROP CONSTRAINT id_pk;
       public         postgres    false    189    189            �           2606    16503    ordemproducao numero_pk 
   CONSTRAINT     R   ALTER TABLE ONLY ordemproducao
    ADD CONSTRAINT numero_pk PRIMARY KEY (numero);
 A   ALTER TABLE ONLY public.ordemproducao DROP CONSTRAINT numero_pk;
       public         postgres    false    188    188            �           2606    16478    produtos produto_pk 
   CONSTRAINT     N   ALTER TABLE ONLY produtos
    ADD CONSTRAINT produto_pk PRIMARY KEY (codigo);
 =   ALTER TABLE ONLY public.produtos DROP CONSTRAINT produto_pk;
       public         postgres    false    185    185            �           2606    16483    tipo_produto tipo_pk 
   CONSTRAINT     O   ALTER TABLE ONLY tipo_produto
    ADD CONSTRAINT tipo_pk PRIMARY KEY (codigo);
 >   ALTER TABLE ONLY public.tipo_produto DROP CONSTRAINT tipo_pk;
       public         postgres    false    186    186            �           2606    16514 !   itensordemproducao codigo_item_fk    FK CONSTRAINT     }   ALTER TABLE ONLY itensordemproducao
    ADD CONSTRAINT codigo_item_fk FOREIGN KEY (codigo_item) REFERENCES produtos(codigo);
 K   ALTER TABLE ONLY public.itensordemproducao DROP CONSTRAINT codigo_item_fk;
       public       postgres    false    189    2016    185            �           2606    16494    composicao codigo_produto_fk    FK CONSTRAINT     {   ALTER TABLE ONLY composicao
    ADD CONSTRAINT codigo_produto_fk FOREIGN KEY (codigo_produto) REFERENCES produtos(codigo);
 F   ALTER TABLE ONLY public.composicao DROP CONSTRAINT codigo_produto_fk;
       public       postgres    false    187    2016    185            �           2606    16509 "   itensordemproducao numero_ordem_fk    FK CONSTRAINT     �   ALTER TABLE ONLY itensordemproducao
    ADD CONSTRAINT numero_ordem_fk FOREIGN KEY (numero_ordem) REFERENCES ordemproducao(numero);
 L   ALTER TABLE ONLY public.itensordemproducao DROP CONSTRAINT numero_ordem_fk;
       public       postgres    false    189    188    2022            �           2606    16484    produtos produtos_tipo_fk    FK CONSTRAINT     z   ALTER TABLE ONLY produtos
    ADD CONSTRAINT produtos_tipo_fk FOREIGN KEY (tipo_produto) REFERENCES tipo_produto(codigo);
 C   ALTER TABLE ONLY public.produtos DROP CONSTRAINT produtos_tipo_fk;
       public       postgres    false    2018    186    185            d   ;   x�]��  ���0�����/��I�Rb���f�H�k�R,u�Is��75�؇��      f   -   x�3�4�4�4�4�46�2rL��Ȕ�(n�1�42����� |4�      e   9   x�3�(�O)=����|CN#Cs]CC]#Sӌ����,91_��"S��=... }�.      b   �   x�=�M
�0���9�ؿ�.U���Lch5#1��\y�^�i����xI�@ɫ�Ǟ4�
�F������_"�(�5>-��C�R�R��#�<�n�)ر�qw�yzw� ���*j=�ӋWk_ƾ!���EK5z�z�1x�P�I�t��cŇ������}���'���K�F�      c   %   x�3�t��-�/�<����|.#7/5�$�+F��� �Sc     