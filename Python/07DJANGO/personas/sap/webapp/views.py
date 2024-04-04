from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.

def bienvenido(request):
    return render(request, 'bienvenido.html')

def despedirse(request):
    return HttpResponse('despedida desde django')