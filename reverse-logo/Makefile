TEX=$(wildcard *.tex)
MAIN=slides.tex
TARGET=slides.pdf
LOCK=.lock

$(TARGET): $(TEX) $(LOCK)
	pdflatex $(MAIN)

$(LOCK): $(TEX)
	pdflatex $(MAIN)
	touch $(LOCK)

clean:
	rm -rf *.aux *.log *.nav *.out *.snm *.toc *.vrb *.log $(TARGET)
