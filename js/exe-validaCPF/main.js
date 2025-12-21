class ValidateCPF {
    constructor(cpf) {
        this.cpf = cpf;
        Object.defineProperty(this, 'clearCPF', {
            writable: false,
            enumerable: true,
            configurable: false,
            value: cpf.replace(/\D+/g, '')
        });
    }

    isSequence() {
        return this.clearCPF.charAt(0).repeat(this.clearCPF.length) === this.clearCPF;
    }

    generateNewCPF() {
        const cpfWithoutDigits = this.clearCPF.slice(0, -2);
        const digit1 = ValidateCPF.generateDigit(cpfWithoutDigits);
        const digit2 = ValidateCPF.generateDigit(cpfWithoutDigits + digit1);
        this.newCPF = cpfWithoutDigits + digit1 + digit2;
    }

    static generateDigit(cpfWithoutDigits) {
        let total = 0;
        let reverse = cpfWithoutDigits.length + 1;

        for (let numericalString of cpfWithoutDigits){            
            total += reverse * Number(numericalString);            
            reverse --;
        }
        
        const digit = 11 - (total %  11);
        return digit <= 9  ? String(digit) : '0';
    }

    validate() {
        if (!this.clearCPF) return false;
        if(typeof this.clearCPF !== 'string' ) return false;
        if(this.clearCPF.length !== 11) return false;
        if(this.isSequence()) return false;
        this.generateNewCPF();

        return this.newCPF === this.clearCPF;
    }
}

const c1 = new ValidateCPF('070.987.720-03');
const c2 = new ValidateCPF('999.999.999-03');
const c3 = new ValidateCPF('073.989.620-03');


console.log(`Is the CPF: ${c1.cpf} valid ? ` + c1.validate());
console.log(`Is the CPF: ${c2.cpf} valid ? ` + c2.validate());
console.log(`Is the CPF: ${c3.cpf} valid ? ` + c3.validate());
