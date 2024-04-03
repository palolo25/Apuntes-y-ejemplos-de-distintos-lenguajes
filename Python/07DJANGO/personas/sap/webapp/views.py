from django.http import HttpResponse

# Create your views here.

def bienvenido(request):
    return HttpResponse('Hola mundo desde Django')

def despedirse(request):
    return HttpResponse('despedida desde django')