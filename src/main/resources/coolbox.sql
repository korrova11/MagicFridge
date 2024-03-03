--
-- PostgreSQL database dump
--

-- Dumped from database version 14.11 (Ubuntu 14.11-0ubuntu0.22.04.1)
-- Dumped by pg_dump version 14.11 (Ubuntu 14.11-0ubuntu0.22.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: ProdImage; Type: TABLE; Schema: public; Owner: arcad
--

CREATE TABLE public."ProdImage" (
    id bigint NOT NULL,
    name_img character varying NOT NULL,
    pid bigint NOT NULL,
    comment_img character varying,
    preview bytea,
    path_img character varying
);


ALTER TABLE public."ProdImage" OWNER TO arcad;

--
-- Name: Products; Type: TABLE; Schema: public; Owner: arcad
--

CREATE TABLE public."Products" (
    id bigint NOT NULL,
    "Name" character varying,
    barcode character varying,
    description character varying,
    weight_id character varying NOT NULL
);


ALTER TABLE public."Products" OWNER TO arcad;

--
-- Name: prodimage_id_seq; Type: SEQUENCE; Schema: public; Owner: arcad
--

ALTER TABLE public."ProdImage" ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.prodimage_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: productimage; Type: TABLE; Schema: public; Owner: arcad
--

CREATE TABLE public.productimage (
    id bigint NOT NULL,
    "Name" character varying NOT NULL,
    pid bigint NOT NULL,
    comment character varying,
    previev bytea,
    path_img character varying
);


ALTER TABLE public.productimage OWNER TO arcad;

--
-- Name: productimage_id_seq; Type: SEQUENCE; Schema: public; Owner: arcad
--

ALTER TABLE public.productimage ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.productimage_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: products_id_seq; Type: SEQUENCE; Schema: public; Owner: arcad
--

ALTER TABLE public."Products" ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.products_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: recipe; Type: TABLE; Schema: public; Owner: arcad
--

CREATE TABLE public.recipe (
    id bigint NOT NULL,
    name character varying,
    description character varying,
    comment character varying,
    cooking_method character varying
);


ALTER TABLE public.recipe OWNER TO arcad;

--
-- Name: recipe_id_seq; Type: SEQUENCE; Schema: public; Owner: arcad
--

ALTER TABLE public.recipe ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.recipe_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: recipe_ingredients; Type: TABLE; Schema: public; Owner: arcad
--

CREATE TABLE public.recipe_ingredients (
    recipe_id bigint NOT NULL,
    product_id bigint NOT NULL,
    ammount integer NOT NULL,
    weight_id integer NOT NULL
);


ALTER TABLE public.recipe_ingredients OWNER TO arcad;

--
-- Name: weight; Type: TABLE; Schema: public; Owner: arcad
--

CREATE TABLE public.weight (
    id bigint NOT NULL,
    name_weight character varying,
    rate_weight real NOT NULL,
    master_id bigint NOT NULL
);


ALTER TABLE public.weight OWNER TO arcad;

--
-- Name: weight_id_seq; Type: SEQUENCE; Schema: public; Owner: arcad
--

ALTER TABLE public.weight ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.weight_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Data for Name: ProdImage; Type: TABLE DATA; Schema: public; Owner: arcad
--

COPY public."ProdImage" (id, name_img, pid, comment_img, preview, path_img) FROM stdin;
\.


--
-- Data for Name: Products; Type: TABLE DATA; Schema: public; Owner: arcad
--

COPY public."Products" (id, "Name", barcode, description, weight_id) FROM stdin;
\.


--
-- Data for Name: productimage; Type: TABLE DATA; Schema: public; Owner: arcad
--

COPY public.productimage (id, "Name", pid, comment, previev, path_img) FROM stdin;
\.


--
-- Data for Name: recipe; Type: TABLE DATA; Schema: public; Owner: arcad
--

COPY public.recipe (id, name, description, comment, cooking_method) FROM stdin;
\.


--
-- Data for Name: recipe_ingredients; Type: TABLE DATA; Schema: public; Owner: arcad
--

COPY public.recipe_ingredients (recipe_id, product_id, ammount, weight_id) FROM stdin;
\.


--
-- Data for Name: weight; Type: TABLE DATA; Schema: public; Owner: arcad
--

COPY public.weight (id, name_weight, rate_weight, master_id) FROM stdin;
\.


--
-- Name: prodimage_id_seq; Type: SEQUENCE SET; Schema: public; Owner: arcad
--

SELECT pg_catalog.setval('public.prodimage_id_seq', 1, false);


--
-- Name: productimage_id_seq; Type: SEQUENCE SET; Schema: public; Owner: arcad
--

SELECT pg_catalog.setval('public.productimage_id_seq', 1, false);


--
-- Name: products_id_seq; Type: SEQUENCE SET; Schema: public; Owner: arcad
--

SELECT pg_catalog.setval('public.products_id_seq', 1, false);


--
-- Name: recipe_id_seq; Type: SEQUENCE SET; Schema: public; Owner: arcad
--

SELECT pg_catalog.setval('public.recipe_id_seq', 1, false);


--
-- Name: weight_id_seq; Type: SEQUENCE SET; Schema: public; Owner: arcad
--

SELECT pg_catalog.setval('public.weight_id_seq', 1, false);


--
-- Name: productimage image; Type: CONSTRAINT; Schema: public; Owner: arcad
--

ALTER TABLE ONLY public.productimage
    ADD CONSTRAINT image UNIQUE (id);


--
-- Name: ProdImage prodimage_unique; Type: CONSTRAINT; Schema: public; Owner: arcad
--

ALTER TABLE ONLY public."ProdImage"
    ADD CONSTRAINT prodimage_unique UNIQUE (id);


--
-- Name: productimage productimage_pk; Type: CONSTRAINT; Schema: public; Owner: arcad
--

ALTER TABLE ONLY public.productimage
    ADD CONSTRAINT productimage_pk PRIMARY KEY ("Name");


--
-- Name: recipe_ingredients recipe_ingredients_pk; Type: CONSTRAINT; Schema: public; Owner: arcad
--

ALTER TABLE ONLY public.recipe_ingredients
    ADD CONSTRAINT recipe_ingredients_pk PRIMARY KEY (recipe_id);


--
-- Name: recipe recipe_unique; Type: CONSTRAINT; Schema: public; Owner: arcad
--

ALTER TABLE ONLY public.recipe
    ADD CONSTRAINT recipe_unique UNIQUE (id);


--
-- Name: weight units_unique; Type: CONSTRAINT; Schema: public; Owner: arcad
--

ALTER TABLE ONLY public.weight
    ADD CONSTRAINT units_unique UNIQUE (id);


--
-- Name: products_id_idx; Type: INDEX; Schema: public; Owner: arcad
--

CREATE INDEX products_id_idx ON public."Products" USING btree (id);


--
-- Name: recipe_ingredients_recipe_id_idx; Type: INDEX; Schema: public; Owner: arcad
--

CREATE UNIQUE INDEX recipe_ingredients_recipe_id_idx ON public.recipe_ingredients USING btree (recipe_id, product_id);


--
-- Name: recipe_ingredients recipe_ingredients_recipe_fk; Type: FK CONSTRAINT; Schema: public; Owner: arcad
--

ALTER TABLE ONLY public.recipe_ingredients
    ADD CONSTRAINT recipe_ingredients_recipe_fk FOREIGN KEY (recipe_id) REFERENCES public.recipe(id);


--
-- PostgreSQL database dump complete
--

