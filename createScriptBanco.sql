SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(80) NOT NULL ,
  `rg` VARCHAR(10) NULL ,
  `cpf` VARCHAR(12) NULL ,
  `balanco` DOUBLE NULL ,
  `telefone` VARCHAR(9) NULL ,
  `celular` VARCHAR(9) NULL ,
  `email` VARCHAR(50) NULL ,
  `cep` VARCHAR(8) NULL ,
  `bairro` VARCHAR(40) NULL ,
  `cidade` VARCHAR(25) NULL ,
  `logradouro` VARCHAR(80) NULL ,
  `complemento` VARCHAR(10) NULL ,
  `estado` VARCHAR(2) NULL ,
  `numero` INT NULL ,
  `cnpj` VARCHAR(12) NULL ,
  `cliente_fisico` TINYINT(1) NULL ,
  PRIMARY KEY (`idCliente`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Produto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`Produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT ,
  `cor` VARCHAR(20) NULL ,
  `estoque_min` INT NULL ,
  `idFornecedor` INT NULL ,
  `marca` VARCHAR(40) NULL ,
  `modelo` VARCHAR(40) NULL ,
  `nome` VARCHAR(65) NULL ,
  `quantidade` INT NULL ,
  `valor_custo` DOUBLE NULL ,
  `valor_venda` DOUBLE NULL ,
  PRIMARY KEY (`idProduto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Veiculo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`Veiculo` (
  `idVeiculo` INT NOT NULL AUTO_INCREMENT ,
  `ano` INT NULL ,
  `cor` VARCHAR(20) NULL ,
  `idCliente` INT NULL ,
  `marca` VARCHAR(40) NULL ,
  `modelo` VARCHAR(40) NULL ,
  `placa` VARCHAR(10) NULL ,
  PRIMARY KEY (`idVeiculo`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Fornecedor`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`Fornecedor` (
  `idFornecedor` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(80) NOT NULL ,
  `telefone` VARCHAR(9) NULL ,
  `celular` VARCHAR(9) NULL ,
  `email` VARCHAR(50) NULL ,
  `cep` VARCHAR(8) NULL ,
  `bairro` VARCHAR(40) NULL ,
  `cidade` VARCHAR(40) NULL ,
  `logradouro` VARCHAR(50) NULL ,
  `complemento` VARCHAR(10) NULL ,
  `estado` VARCHAR(2) NULL ,
  `numero` VARCHAR(5) NULL ,
  `cnpj` VARCHAR(12) NULL ,
  PRIMARY KEY (`idFornecedor`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Funcionario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`Funcionario` (
  `idFuncionario` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(65) NOT NULL ,
  `rg` VARCHAR(10) NULL ,
  `cpf` VARCHAR(12) NULL ,
  `telefone` VARCHAR(12) NULL ,
  `celular` VARCHAR(12) NULL ,
  `email` VARCHAR(50) NULL ,
  `cep` VARCHAR(9) NULL ,
  `logradouro` VARCHAR(60) NULL ,
  `numero` VARCHAR(8) NULL ,
  `complemento` VARCHAR(10) NULL ,
  `bairro` VARCHAR(45) NULL ,
  `cidade` VARCHAR(45) NULL ,
  `estado` VARCHAR(2) NULL ,
  `tipo` VARCHAR(20) NULL ,
  `ctps` VARCHAR(20) NULL ,
  `salario` DOUBLE NULL ,
  `senha` VARCHAR(45) NULL ,
  PRIMARY KEY (`idFuncionario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`OrdemServico`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`OrdemServico` (
  `idOrdemServico` INT NOT NULL AUTO_INCREMENT ,
  `descricao` VARCHAR(1024) NULL ,
  `data` DATETIME NULL ,
  `idCliente` INT NULL ,
  `idVeiculo` INT NULL ,
  PRIMARY KEY (`idOrdemServico`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`scheduledb`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`scheduledb` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `NomedoCompromisso` VARCHAR(100) NULL ,
  `Criação` DATETIME NULL ,
  `Due` DATETIME NULL ,
  `Obs` LONGTEXT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;

USE `mydb` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
