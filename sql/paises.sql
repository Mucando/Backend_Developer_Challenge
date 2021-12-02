-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Tempo de geração: 02-Dez-2021 às 03:07
-- Versão do servidor: 5.7.24
-- versão do PHP: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `paises`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `paises`
--

CREATE TABLE `paises` (
  `id` int(11) NOT NULL,
  `area` varchar(255) DEFAULT NULL,
  `capital` varchar(255) DEFAULT NULL,
  `nome_pais` varchar(255) DEFAULT NULL,
  `regiao` varchar(255) DEFAULT NULL,
  `sub_region` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `paises`
--

INSERT INTO `paises` (`id`, `area`, `capital`, `nome_pais`, `regiao`, `sub_region`) VALUES
(1102, '801 590 km²', 'Maputo', 'Mozambique', 'África Austral', ''),
(1103, '1 246 700 km² ', 'Luanda', 'Angola', 'África Austral', ''),
(1104, '1 221 037 km²', 'Pretória', 'África do Sul', 'África Austral', ''),
(1105, '112 622 km² ', 'Porto Novo', 'Benim', 'África Ocidental', ''),
(1106, '581 730 km² ', 'Gaborone', 'Botsuana', 'África Austral', ''),
(1107, '2 381 741 km²', 'Argel', 'Argélia', 'África do Norte', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `paises_sequenc`
--

CREATE TABLE `paises_sequenc` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `paises_sequenc`
--

INSERT INTO `paises_sequenc` (`next_val`) VALUES
(1201),
(1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
