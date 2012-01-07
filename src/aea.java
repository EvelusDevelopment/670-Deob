
final class aea {

   byte[] c;
   int[] f_i;
   int h;
   int g;
   byte[] e;
   int a;
   int b;
   int f;
   int d;


   final void e() {
      int var1 = this.g();
      int var2 = this.a();
      if(this.a != var1 || this.h != var2) {
         byte[] var3 = new byte[var1 * var2];
         int var5;
         int var6;
         int var7;
         if(this.e != null) {
            byte[] var4 = new byte[var1 * var2];

            for(var5 = 0; var5 < this.h; ++var5) {
               var6 = var5 * this.a;
               var7 = (var5 + this.b) * var1 + this.f;

               for(int var8 = 0; var8 < this.a; ++var8) {
                  var3[var7] = this.c[var6];
                  var4[var7++] = this.e[var6++];
               }
            }

            this.e = var4;
         } else {
            for(int var9 = 0; var9 < this.h; ++var9) {
               var5 = var9 * this.a;
               var6 = (var9 + this.b) * var1 + this.f;

               for(var7 = 0; var7 < this.a; ++var7) {
                  var3[var6++] = this.c[var5++];
               }
            }
         }

         this.g = 0;
         this.b = 0;
         this.d = 0;
         this.f = 0;
         this.a = var1;
         this.h = var2;
         this.c = var3;
      }
   }

   final void d() {
      byte[] var1 = new byte[this.a * this.h];
      int var2 = 0;
      int var3;
      int var4;
      if(this.e == null) {
         for(var3 = 0; var3 < this.a; ++var3) {
            for(var4 = this.h - 1; var4 >= 0; --var4) {
               var1[var2++] = this.c[var3 + var4 * this.a];
            }
         }

         this.c = var1;
      } else {
         byte[] var6 = new byte[this.a * this.h];

         for(var4 = 0; var4 < this.a; ++var4) {
            for(int var5 = this.h - 1; var5 >= 0; --var5) {
               var1[var2] = this.c[var4 + var5 * this.a];
               var6[var2++] = this.e[var4 + var5 * this.a];
            }
         }

         this.c = var1;
         this.e = var6;
      }

      var3 = this.b;
      this.b = this.f;
      this.f = this.g;
      this.g = this.d;
      this.d = this.b;
      var3 = this.h;
      this.h = this.a;
      this.a = var3;
   }

   static final aea b(Object[] var0, int var1, int var2) {
      byte[] var3 = qn.a(var1, var2, var0, 41);
      return var3 == null?null:a(var3)[0];
   }

   final void a(int var1) {
      int var2 = -1;
      int var3;
      int var4;
      int var5;
      if(this.f_i.length < 255) {
         for(var3 = 0; var3 < this.f_i.length; ++var3) {
            if(this.f_i[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.f_i.length;
            int[] var16 = new int[this.f_i.length + 1];
            qo.a(this.f_i, 0, var16, 0, this.f_i.length);
            this.f_i = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         int var6 = var1 & 255;

         for(int var7 = 0; var7 < this.f_i.length; ++var7) {
            int var8 = this.f_i[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      for(var3 = this.h - 1; var3 > 0; --var3) {
         var4 = var3 * this.a;

         for(var5 = this.a - 1; var5 > 0; --var5) {
            if(this.f_i[this.c[var5 + var4] & 255] == 0 && this.f_i[this.c[var5 + var4 - 1 - this.a] & 255] != 0) {
               this.c[var5 + var4] = (byte)var2;
            }
         }
      }

   }

   final int g() {
      return this.a + this.f + this.d;
   }

   final void b() {
      byte[] var2 = this.c;
      byte var1;
      int var3;
      int var4;
      int var5;
      int var6;
      if(this.e == null) {
         for(var3 = (this.h >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.a;
            var5 = (this.h - var3 - 1) * this.a;

            for(var6 = -this.a; var6 < 0; ++var6) {
               var1 = var2[var4];
               var2[var4] = var2[var5];
               var2[var5] = var1;
               ++var4;
               ++var5;
            }
         }
      } else {
         byte[] var8 = this.e;

         for(var4 = (this.h >> 1) - 1; var4 >= 0; --var4) {
            var5 = var4 * this.a;
            var6 = (this.h - var4 - 1) * this.a;

            for(int var7 = -this.a; var7 < 0; ++var7) {
               var1 = var2[var5];
               var2[var5] = var2[var6];
               var2[var6] = var1;
               var1 = var8[var5];
               var8[var5] = var8[var6];
               var8[var6] = var1;
               ++var5;
               ++var6;
            }
         }
      }

      var3 = this.b;
      this.b = this.g;
      this.g = var3;
   }

   static final aea[] a(Object[] var0, int var1) {
      byte[] var2 = fd.a(-2, var1, var0);
      return var2 == null?null:a(var2);
   }

   static final aea[] a(Object[] var0, int var1, int var2) {
      byte[] var3 = qn.a(var1, var2, var0, -74);
      return var3 == null?null:a(var3);
   }

   static final aea b(Object[] var0, int var1) {
      byte[] var2 = fd.a(-2, var1, var0);
      return var2 == null?null:a(var2)[0];
   }

   final void c() {
      byte[] var2 = this.c;
      byte var1;
      int var3;
      int var4;
      int var5;
      if(this.e == null) {
         for(var3 = this.h - 1; var3 >= 0; --var3) {
            var4 = var3 * this.a;

            for(var5 = (var3 + 1) * this.a; var4 < var5; ++var4) {
               --var5;
               var1 = var2[var4];
               var2[var4] = var2[var5];
               var2[var5] = var1;
            }
         }
      } else {
         byte[] var7 = this.e;

         for(var4 = this.h - 1; var4 >= 0; --var4) {
            var5 = var4 * this.a;

            for(int var6 = (var4 + 1) * this.a; var5 < var6; ++var5) {
               --var6;
               var1 = var2[var5];
               var2[var5] = var2[var6];
               var2[var6] = var1;
               var1 = var7[var5];
               var7[var5] = var7[var6];
               var7[var6] = var1;
            }
         }
      }

      var3 = this.f;
      this.f = this.d;
      this.d = var3;
   }

   final void b(int var1) {
      int var2 = -1;
      int var3;
      int var5;
      int var6;
      int var7;
      if(this.f_i.length < 255) {
         for(var3 = 0; var3 < this.f_i.length; ++var3) {
            if(this.f_i[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.f_i.length;
            int[] var16 = new int[this.f_i.length + 1];
            qo.a(this.f_i, 0, var16, 0, this.f_i.length);
            this.f_i = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         int var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         var6 = var1 & 255;

         for(var7 = 0; var7 < this.f_i.length; ++var7) {
            int var8 = this.f_i[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      var3 = 0;
      byte[] var17 = new byte[this.a * this.h];

      for(var5 = 0; var5 < this.h; ++var5) {
         for(var6 = 0; var6 < this.a; ++var6) {
            var7 = this.c[var3] & 255;
            if(this.f_i[var7] == 0) {
               if(var6 > 0 && this.f_i[this.c[var3 - 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 > 0 && this.f_i[this.c[var3 - this.a] & 255] != 0) {
                  var7 = var2;
               } else if(var6 < this.a - 1 && this.f_i[this.c[var3 + 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 < this.h - 1 && this.f_i[this.c[var3 + this.a] & 255] != 0) {
                  var7 = var2;
               }
            }

            var17[var3++] = (byte)var7;
         }
      }

      this.c = var17;
   }

   final int a() {
      return this.h + this.b + this.g;
   }

   final void c(int var1) {
      int var2 = this.g();
      int var3 = this.a();
      if(this.a != var2 || this.h != var3) {
         int var4 = var1;
         if(var1 > this.f) {
            var4 = this.f;
         }

         int var5 = var1;
         if(var1 + this.f + this.a > var2) {
            var5 = var2 - this.f - this.a;
         }

         int var6 = var1;
         if(var1 > this.b) {
            var6 = this.b;
         }

         int var7 = var1;
         if(var1 + this.b + this.h > var3) {
            var7 = var3 - this.b - this.h;
         }

         int var8 = this.a + var4 + var5;
         int var9 = this.h + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         int var12;
         int var13;
         int var14;
         if(this.e == null) {
            for(int var11 = 0; var11 < this.h; ++var11) {
               var12 = var11 * this.a;
               var13 = (var11 + var6) * var8 + var4;

               for(var14 = 0; var14 < this.a; ++var14) {
                  var10[var13++] = this.c[var12++];
               }
            }
         } else {
            byte[] var16 = new byte[var8 * var9];

            for(var12 = 0; var12 < this.h; ++var12) {
               var13 = var12 * this.a;
               var14 = (var12 + var6) * var8 + var4;

               for(int var15 = 0; var15 < this.a; ++var15) {
                  var16[var14] = this.e[var13];
                  var10[var14++] = this.c[var13++];
               }
            }

            this.e = var16;
         }

         this.f -= var4;
         this.b -= var6;
         this.d -= var5;
         this.g -= var7;
         this.a = var8;
         this.h = var9;
         this.c = var10;
      }
   }

   private static final aea[] a(byte[] var0) {
      Object[] var1 = jta.a((byte)-117, var0, new Object[3]);
      ((int[])((int[])var1[1]))[0] = var0.length - 2;
      int var2 = de.a((int)0, var1);
      aea[] var3 = new aea[var2];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new aea();
      }

      ((int[])((int[])var1[1]))[0] = var0.length - 7 - var2 * 8;
      var4 = de.a((int)0, var1);
      int var5 = de.a((int)0, var1);
      int var6 = (fh.a(var1, false) & 255) + 1;

      int var7;
      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].f = de.a((int)0, var1);
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].b = de.a((int)0, var1);
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].a = de.a((int)0, var1);
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].h = de.a((int)0, var1);
      }

      for(var7 = 0; var7 < var2; ++var7) {
         aea var8 = var3[var7];
         var8.d = var4 - var8.a - var8.f;
         var8.g = var5 - var8.h - var8.b;
      }

      ((int[])((int[])var1[1]))[0] = var0.length - 7 - var2 * 8 - (var6 - 1) * 3;
      int[] var17 = new int[var6];

      int var16;
      for(var16 = 1; var16 < var6; ++var16) {
         var17[var16] = td.a(var1, 92);
         if(var17[var16] == 0) {
            var17[var16] = 1;
         }
      }

      for(var16 = 0; var16 < var2; ++var16) {
         var3[var16].f_i = var17;
      }

      ((int[])((int[])var1[1]))[0] = 0;

      for(var16 = 0; var16 < var2; ++var16) {
         aea var9 = var3[var16];
         int var10 = var9.a * var9.h;
         var9.c = new byte[var10];
         int var11 = fh.a(var1, false);
         int var13;
         if((var11 & 2) == 0) {
            int var12;
            if((var11 & 1) == 0) {
               for(var12 = 0; var12 < var10; ++var12) {
                  var9.c[var12] = ipa.a(var1, (int)-95);
               }
            } else {
               for(var12 = 0; var12 < var9.a; ++var12) {
                  for(var13 = 0; var13 < var9.h; ++var13) {
                     var9.c[var12 + var13 * var9.a] = ipa.a(var1, (int)-81);
                  }
               }
            }
         } else {
            boolean var18 = false;
            var9.e = new byte[var10];
            if((var11 & 1) == 0) {
               for(var13 = 0; var13 < var10; ++var13) {
                  var9.c[var13] = ipa.a(var1, (int)-103);
               }

               for(var13 = 0; var13 < var10; ++var13) {
                  byte var14 = var9.e[var13] = ipa.a(var1, (int)-83);
                  var18 |= var14 != -1;
               }
            } else {
               int var19;
               for(var13 = 0; var13 < var9.a; ++var13) {
                  for(var19 = 0; var19 < var9.h; ++var19) {
                     var9.c[var13 + var19 * var9.a] = ipa.a(var1, (int)-99);
                  }
               }

               for(var13 = 0; var13 < var9.a; ++var13) {
                  for(var19 = 0; var19 < var9.h; ++var19) {
                     byte var15 = var9.e[var13 + var19 * var9.a] = ipa.a(var1, (int)-104);
                     var18 |= var15 != -1;
                  }
               }
            }

            if(!var18) {
               var9.e = null;
            }
         }
      }

      return var3;
   }

   final int[] f() {
      int var1 = this.g();
      int[] var2 = new int[var1 * this.a()];
      int var3;
      int var4;
      int var5;
      int var6;
      if(this.e != null) {
         for(var3 = 0; var3 < this.h; ++var3) {
            var4 = var3 * this.a;
            var5 = this.f + (var3 + this.b) * var1;

            for(var6 = 0; var6 < this.a; ++var6) {
               var2[var5++] = this.e[var4] << 24 | this.f_i[this.c[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(var3 = 0; var3 < this.h; ++var3) {
            var4 = var3 * this.a;
            var5 = this.f + (var3 + this.b) * var1;

            for(var6 = 0; var6 < this.a; ++var6) {
               int var7 = this.f_i[this.c[var4++] & 255];
               if(var7 != 0) {
                  var2[var5++] = -16777216 | var7;
               } else {
                  var2[var5++] = 0;
               }
            }
         }
      }

      return var2;
   }
}
