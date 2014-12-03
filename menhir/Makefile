INPUT=$(wildcard *.tex)

all: slides.pdf

slides.pdf: $(INPUT)
	pdflatex slides.tex

clean:
	rm -rf *.aux *.log *.out *.nav *.snm *.toc *.listing slides.pdf

.PHONY: all slides.pdf clean
